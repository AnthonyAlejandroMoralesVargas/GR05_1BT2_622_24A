
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Poli - Park</title>
         <style>
            .centered {
                text-align: center;
                font-weight: bold;
                font-size: 2em;
            }
            .poli {
                color: red;
            }
            .park {
                color: blue;
            }
        </style>
    </head>
    <body>
        <h1 class="centered">
            <span class="poli">Poli</span> <span class="park">Park</span> 🚗
        </h1>
        
        <h2>Datos del Vehículo</h2>
        <form action="SvVehiculos" method="POST">
            <p><label>Placa:</label> <input type="text" name="placa"></p>
            <p><label>Marca:</label> <input type="text" name="marca"></p>
            <p><label>Modelo:</label> <input type="text" name="modelo"></p>
            <p><label>Color:</label> <input type="text" name="color"></p>
            <button type="submit"> Enviar </button>
        </form>
         <br><br>
        <form action="SvVehiculos" method="GET">
            <button type="submit"> Ver vehiculos registrados</button>
        </form>

        
    </body>
</html>
