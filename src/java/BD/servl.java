/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import BD.user;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author abdelhak
 */
public class servl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
                    String p= request.getParameter("page");
if("id".equals(p))
{
             String l= request.getParameter("log");
            String m= request.getParameter("mdp");
            user u=new user(l,m);
if ( u.ident()==0)
{response.sendRedirect("index2.jsp");}
else
{response.sendRedirect("accueil.jsp");}
            
}  
if ("aj".equals(p))
    {
  String n= request.getParameter("nom");
  String pn= request.getParameter("prenom");
  String lg= request.getParameter("login");
  String mp= request.getParameter("mdp");
  String s= request.getParameter("sal");
  String g= request.getParameter("grade");
    
       user u=new user(n,pn,lg,mp,Integer.parseInt(s),g);
       u.ajout();
       response.sendRedirect("user.jsp");
       
    }
 
if ("pr".equals(p))
    {
 
  String lg= request.getParameter("login");
  String mp= request.getParameter("mdp");
  
    
       user u=new user(lg,mp);
       u.modification();
       response.sendRedirect("accueil.jsp");
       
    }

if ("supu".equals(p))
    {
 
  int id= Integer.parseInt(request.getParameter("id"));
  
    
       user u=new user(id);
       u.supp();
       response.sendRedirect("user.jsp");
       
    }
            out.println("<head>");
            out.println("<title>Servlet servl</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet servl at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(servl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(servl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
