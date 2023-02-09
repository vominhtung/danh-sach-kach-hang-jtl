<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>DSKH</title>
    <style>
        *{
            margin: 0;
            padding: 0;
        }
        img {
            width: 50px;
            height: 50px;
        }
        th  {
            width: 200px;
            /*text-align: left;*/
            border: 1px solid black;
            border-collapse: collapse;
            text-align: center;
        }

        td {
            /*width: 200px;*/
            text-align: center;
            border: 1px solid black;
            border-collapse: collapse;
        }

        table  {
            background-color: crimson;
            color: gold;
            width: 1170px;
            /*text-align: center;*/
            border: 1px solid black;
            border-collapse: collapse;

        }

        h1 {
            color: limegreen;
            text-align: center;
            width: 585px;
            justify-content: center;
        }
        div {
            width: 1000px;
        }
    </style>
</head>
<body>

<div>
    <h1>Danh Sách Khách Hàng</h1>
    <table>
        <tr>
            <th>Tên </th>
            <th>Ngày sinh</th>
            <th>Địa chỉ</th>
            <th>Ảnh</th>
        </tr>
        <c:forEach items="${DBCus}" var="i">
            <tr>
                <td>${i.getName()}</td>
                <td>${i.getDateOfBirth()}</td>
                <td>${i.getAddress()}</td>
                <td>
                    <img src="${i.getImg()}"></td>
            </tr>
        </c:forEach>
    </table>
</div>


</body>
</html>