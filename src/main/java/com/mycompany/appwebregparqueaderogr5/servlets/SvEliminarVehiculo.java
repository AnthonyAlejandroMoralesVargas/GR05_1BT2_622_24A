
package com.mycompany.appwebregparqueaderogr5.servlets;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Controladora;
import logica.Vehiculo;

@WebServlet(name = "SvEliminarVehiculo", urlPatterns = {"/SvEliminarVehiculo"})
public class SvEliminarVehiculo extends HttpServlet {
    Controladora control = new Controladora();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id_eliminar"));
        control.borrarVehiculo(id);
        List<Vehiculo> listaVehiculos = control.traerVehiculos();
        HttpSession sesion = request.getSession();
        sesion.setAttribute("listaVehiculos", listaVehiculos);
        response.sendRedirect("MostrarVehiculos.jsp");
    }
}