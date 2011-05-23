package com.xtrafe.mobile.fma;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.MotionEvent;

//Much of this code boosted from http://www.droidnova.com/android-3d-game-tutorial-part-i,312.html
public class ActOpenGL 
	extends ActBase
{
	private static final float[] triCoords = 
	{
		-0.5f, -0.5f, 0f, 	// (x1, y1, z1)
		0.5f, -0.5f, 0f, 	// (x2, y2, z2)
		0f, 0.5f, 0f 		// (x3, y3, z3)
	};
	
	private OpenGLView openGLView;
	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        openGLView = new OpenGLView(this);
        setContentView(openGLView);
    }
	
	private class OpenGLView extends GLSurfaceView {	    
	    private MyRenderer renderer = new MyRenderer();
	 
	    public OpenGLView(Context context) {
	        super(context);	        
	        setRenderer(renderer);
	    }
	    
	    public boolean onTouchEvent(final MotionEvent event) {
	        queueEvent(new Runnable() {
	            public void run() {
	                renderer.setColor(event.getX() / getWidth(), event.getY() / getHeight(), 1.0f);
	                renderer.setAngle(event.getX() / 10);
	            }
	        });
	        return true;
	    }	    
	    
	    public class MyRenderer implements GLSurfaceView.Renderer {	        	     	    
	    	
			// a raw buffer to hold indices
			private ShortBuffer indexBuffer;			 
			// a raw buffer to hold the vertices
			private FloatBuffer vertexBuffer;
	    	
			private boolean rotate;
			
			private short[] indicesArray = {0, 1, 2};
			private int nrOfVertices = 3;
			
			private float angle;
	        private float red = 0.9f;
	        private float green = 0.2f;
	        private float blue = 0.2f;
	        
			public void onDrawFrame(GL10 gl) {
				// define the color we want to be displayed as the "clipping wall"
		        gl.glClearColor(red, green, blue, 1.0f);
		        // clear the color buffer to show the ClearColor we called above...
		        gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		        // Set the rotation of the scene
		        if (rotate)
		        	gl.glRotatef(angle, 0f, 1f, 0f);
		        // set the color of our triangle
		        gl.glColor4f(0.5f, 0f, 0.5f, 0.5f);		     
		        // define the vertices we want to draw
		        gl.glVertexPointer(3, GL10.GL_FLOAT, 0, vertexBuffer);		     
		        // draw the vertices
		        gl.glDrawElements(GL10.GL_TRIANGLES, nrOfVertices, GL10.GL_UNSIGNED_SHORT, indexBuffer);
		        
		        rotate = false;
			}
			public void onSurfaceChanged(GL10 gl, int width, int height) {
				gl.glViewport(0, 0, width, height);			
			}
			
			public void onSurfaceCreated(GL10 gl, EGLConfig config) {
				gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);
			    makeATriangle();
			}
			
			public void setAngle(float angle) {
			    this.angle = angle;
			    rotate = true;
			}
			
			public void setColor(float red, float green, float blue) {
			    this.red = red;
			    this.green = green;
			    this.blue = blue;
			}									 			
			 
			private void makeATriangle() {
			    // float has 4 bytes
			    ByteBuffer vbb = ByteBuffer.allocateDirect(nrOfVertices * 3 * 4);
			    vbb.order(ByteOrder.nativeOrder());
			    vertexBuffer = vbb.asFloatBuffer();
			 
			    // short has 2 bytes
			    ByteBuffer ibb = ByteBuffer.allocateDirect(nrOfVertices * 2);
			    ibb.order(ByteOrder.nativeOrder());
			    indexBuffer = ibb.asShortBuffer();			 			   
			 
			    vertexBuffer.put(triCoords);
			    indexBuffer.put(indicesArray);
			 
			    vertexBuffer.position(0);
			    indexBuffer.position(0);
			}
	    }	   
	}
}
