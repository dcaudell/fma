/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xtrafe.fma.server.servlets;

import com.google.gson.Gson;
import com.xtrafe.fma.shared.SharedEbayIdSortType;
import com.xtrafe.fma.shared.SharedStrings;
import com.xtrafe.server.ejb.EBayFindingQueryProxy;
import com.xtrafe.server.ejb.EBayShoppingQueryProxy;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EbayQuery extends HttpServlet {

    @EJB
    EBayFindingQueryProxy findingProxy;
    
    @EJB
    EBayShoppingQueryProxy shoppingProxy;
    
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            Object returnObject = null;
            
            SharedEbayIdSortType sortOrder = SharedEbayIdSortType.NONE;
            String sortOrderString = request.getParameter(SharedStrings.parmOrder);
            String itemString = request.getParameter(SharedStrings.parmItem);
            String searchString = request.getParameter(SharedStrings.parmSearch);
            String formatString = request.getParameter(SharedStrings.parmFormat);
            
            if (sortOrderString != null)
                sortOrder = SharedEbayIdSortType.valueOf(sortOrderString);
                        
            if ((searchString != null) &&
                !(searchString.trim().equals(""))){
                searchString = URLDecoder.decode(searchString, "UTF-8");
                returnObject = findingProxy.keywordSearch(searchString, sortOrder);
            }                 
            else if (itemString != null){
                if ((formatString != null) &&
                    (formatString.equals("Flat")))
                        out.print(shoppingProxy.findInfoStringById(itemString));
                else
                    returnObject = shoppingProxy.findById(itemString);
            }
                
                        
            if (returnObject != null) {
                Gson gson = new Gson();            
                String jsonstring = gson.toJson(returnObject);
                out.print(jsonstring);
                out.flush();
            }            
        } 
        finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
