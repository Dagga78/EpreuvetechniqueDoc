/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author jerom
 */
@WebServlet(name = "SystemeVerif", urlPatterns = {"/SystemeVerif"},asyncSupported = true)
public class SystemeVerif extends HttpServlet {

    
    @WebServiceRef(wsdlLocation = "http://localhost:8080/SystemeBancaireWS/SystemeBancaireWS?WSDL")
    bean.SystemeBancaireWS_Service SBCms ;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        AsyncContext asynContext = request.startAsync(request, response);
        asynContext.dispatch("/SystemVerif.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nom = request.getParameter("nom");
        String prenom = request.getParameter("prenom");
        String crdNumber = request.getParameter("cardNumber");
        String cardDate = request.getParameter("cardDate");
        String cardCrypto = request.getParameter("cardCrypto");
        Float prix = Float.parseFloat(request.getParameter("prix"));
        
        bean.SystemeBancaire system = SBCms.getSystemeBancaireWSPort().verifpaiement(nom, prenom, crdNumber, cardDate, cardCrypto, prix);
        System.out.println(system);

        
    }

}
