<%-- 
    Document   : Login
    Created on : May 30, 2017, 6:55:56 PM
    Author     : iamsu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <form action="User" method="post">
            <table>
                <tr>
                    <td>
                        <input type="email" name="mailId" placeholder="Email Id" required="true"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="password" name="password" placeholder="Password" required="true"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="reset" name="cancelBtn" placeholder="Cancel" />
                    </td>
                    <td>
                        <input type="submit" name="submitBtn" placeholder="Sign Up" />
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
