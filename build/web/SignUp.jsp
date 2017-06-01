<%-- 
    Document   : SignUp
    Created on : May 29, 2017, 6:24:11 PM
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
                       <input type="text" name="firstName" value="<%=request.getParameter("firstName")%>" placeholder="First Name" required="true" pattern="[a-zA-Z]{3,}"/>
                    </td>
                    <td>
                        <input type="text" name="lastName" placeholder="Last Name" required="true"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="email" name="mailId" placeholder="Email Id" required="true"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="tel" name="phoneNumber" placeholder="Mobile Number" required="true"/>
                    </td>
                </tr>
                <tr>
                    <td> <label>Gender</label> </td>
                    <td>
                        <input type="radio" name="gender" checked/> Male
                        <input type="radio" name="gender" /> Female
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="password" name="password" placeholder="Password" required="true"/>
                    </td>
                    <td>
                        <input type="password" name="confirmpassword" placeholder="Confirm Password" required="true"/>
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
