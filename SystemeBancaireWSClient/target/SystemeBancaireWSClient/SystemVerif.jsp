<%-- 
    Document   : SystemVerif
    Created on : 4 juil. 2019, 15:43:41
    Author     : jerom
--%>

<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="POST" action="SystemeVerif">
            <input type="text" name="nom" id="nom"/>
            <input type="text" name="prenom" id="prenom"/>
            <input type="text" name="cardNumber" id="cardNumber"/>
            <input type="text" name="cardDate" id="cardDate"/>
            <input type="text" name="cardCrypto" id="cardCrypto"/>
            <input type="number" step="0.01" name="prix" id="prix"/>
            <input type="submit" id="buttonadd" name="buttonadd" value="verif"/>
        </form>
    </body>
</html>
