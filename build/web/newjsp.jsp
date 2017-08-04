<%-- 
    Document   : newjsp
    Created on : Aug 6, 2016, 1:55:26 PM
    Author     : abdelhak
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <%
        
com.mysql.jdbc.Connection conn;

String url= "jdbc:mysql://localhost:3306/";
String dbName;
dbName = "gest_emp";
String driver= "com.mysql.jdbc.Driver";
String userName= "root";
String password="";
Class.forName(driver).newInstance();
conn= (com.mysql.jdbc.Connection) DriverManager.getConnection(url+dbName,userName, password);
System.out.println("la connexion a reussie");
 PreparedStatement pst; 
   pst = (PreparedStatement) conn.prepareStatement("SELECT * FROM `user` WHERE `garde`='admin'"); 
   pst.executeQuery(); 
        ResultSet rs = pst.executeQuery(); 

        
           


            %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
<!-- Button trigger modal -->
<button type="button" class="btn btn-primary btn-lg" data-toggle="modal" data-target="#myModal">
  Launch demo modal
</button>

<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Modal title</h4>
      </div>
      <div class="modal-body">
        <div class="box-content">
                <form name="f" action="servl" method="GET">
<table class="table table-responsive">


<tr>
<td> salaire </td>
<td> <input type="text" class="form-control" name="salaire" value="<% if(rs.next())
{out.print(rs.getString("salaire"));}  %>" > </td>
</tr>
<tr>
<td> grade </td>
<td> <input type="text" class="form-control" name="grade" value="<% if(rs.next())
{out.print(rs.getString("grade"));}  %>"> </td>
</tr>


</table>                <input type="Hidden" name="supu" value="pr">

             
</form>

      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="f.submit()" class="btn btn-primary">modifier</button>
      </div>
    </div>
  </div>
</div>
    </body>
</html>
