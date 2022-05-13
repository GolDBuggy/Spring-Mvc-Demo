<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Uye ekleme </title>
</head>
<body>
    <h2>Uye Ekleme Ekranı</h2>
    <br><br>

    <form:form action="uyeKaydet" modelAttribute="uye" method="POST">
        <form:hidden path="id"/>
        <table>
            <tbody>
            <tr>
                <td><label>İsim:</label></td>
                <td><form:input path="isim"/></td>
            </tr>

            <tr>
                <td><label>Soyisim:</label></td>
                <td><form:input path="soyisim" /></td>
            </tr>

            <tr>
                <td><label>Dogum günü:</label></td>
                <td><form:input path="dogumgunu" /></td>
            </tr>

            <tr>
                <td><label>Telefon:</label></td>
                <td><form:input path="telefon" /> </td>
            </tr>

            <tr>
                <td><label>Metin:</label></td>
                <td><textarea name="message" style="width:200px; height:200px; resize: none;" ></textarea> </td>

            </tr>
            <br><br>
            
            <tr>
                <td><label></label></td>
                <td><input type="submit" value="Kaydet" /></td>
            </tr>
            </tbody>
        </table>

    </form:form>

</body>
</html>
