/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xtrafe.fma.server.servlets;

import com.google.gson.Gson;
import com.xtrafe.fma.shared.SharedStockList;
import com.xtrafe.fma.shared.SharedStrings;
import com.xtrafe.server.ejb.DAOForStocks;
import com.xtrafe.server.log.Log;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StockListing extends HttpServlet {

    @EJB
    DAOForStocks daoForStocks;
    
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
            Object returnObject;
            
            long start = System.currentTimeMillis();
            String symbol = request.getParameter(SharedStrings.parmSymbol);
            if (symbol == null)
                returnObject = daoForStocks.getAllStocks();
            else
                returnObject = daoForStocks.getStock(symbol);            
                                    
            Gson gson = new Gson();            
            String jsonstring = gson.toJson(returnObject);
            out.print(jsonstring);
            out.flush();
            if (returnObject instanceof SharedStockList) {
                long end = System.currentTimeMillis() - start;
                Log.out("Returned " + ((SharedStockList) returnObject).size() + " elements in " + end + "ms");
            }
        } finally {            
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
