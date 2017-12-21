<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yanglk
  Date: 2017/6/12
  Time: 17:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>test</title>
  </head>
  <body>
  <div>
    hi: ${hi}
  </div>
  <div>
    cityCount:${cityCount}
  </div>

  <table border="1">
    <tr>
      <th>Id</th>
      <th>District</th>
      <th>CountryCode</th>
      <th>Population</th>
    </tr>
    <c:forEach items="${cityList}" var="CityEntity">
      <tr>
        <td><a href="/city/city?id=${CityEntity.id}">${CityEntity.id}</a></td>
        <td>${CityEntity.name}</td>
        <td>${CityEntity.countryCode}</td>
        <td>${CityEntity.population}</td>
      </tr>
    </c:forEach>
  </table>
  </body>
</html>
