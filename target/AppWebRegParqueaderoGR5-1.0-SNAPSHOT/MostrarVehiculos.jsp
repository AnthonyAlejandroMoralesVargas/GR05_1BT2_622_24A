<%@page import="java.util.List"%>
<%@page import="logica.Vehiculo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Vehículos</title>
        <style>
            table {
                width: 100%;
                border-collapse: collapse;
            }
            table, th, td {
                border: 1px solid black;
            }
            th, td {
                padding: 10px;
                text-align: left;
            }
            th {
                background-color: #ADD8E6;
            }
            .centered {
                text-align: center;
                font-weight: bold;
                font-size: 2em;
            }
            .vehiculos {
                color: red;
            }
            .registrados {
                color: blue;
            }
        </style>
    </head>
    <body>
        <h1 class="centered">
            <span class="vehiculos">Vehículos</span> <span class="registrados">registrados</span> ?📄
        </h1>
        <%
            List<Vehiculo> listaVehiculos = (List) request.getSession().getAttribute("listaVehiculos");
        %>

        <table>
            <thead>
                <tr>
                    <th>N°</th>
                    <th>ID</th>
                    <th>Placa</th>
                    <th>Marca</th>
                    <th>Modelo</th>
                    <th>Color</th>
                </tr>
            </thead>
            <tbody>
                <%
                    int cont = 1;
                    for (Vehiculo veh : listaVehiculos) {
                %>
                <tr>
                    <td><%=cont%></td>
                    <td><%=veh.getId()%></td>
                    <td><%=veh.getPlaca()%></td>
                    <td><%=veh.getMarca()%></td>
                    <td><%=veh.getModelo()%></td>
                    <td><%=veh.getColor()%></td>
                </tr>
                <%
                    cont = cont + 1;
                    }
                %>
            </tbody>
        </table>

        <br><br>
        <p>Ingrese ID del vehículo a eliminar:</p>
        <form action="SvEliminarVehiculo" method="POST">
            <p> <input type="text" name="id_eliminar"></p>
            <button type="submit">Eliminar Vehículo</button>
        </form>
        
         <br><br>
        <form action="index.jsp" method="GET">
            <button type="submit">Regresar al registro</button>
        </form>
    </body>
</html>
