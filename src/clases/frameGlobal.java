package clases;

import interfaces.Dashboard;
import interfaces.Login;
import interfaces.consulta.Caja;
import interfaces.consulta.Inventario;
import interfaces.consulta.Reportes;
import interfaces.consulta.Ventas;
import interfaces.cruds.*;

public class frameGlobal {
    public static void abrirProductos() {
        Productos p = new Productos();
        p.setVisible(true);
    }

    public static void abrirFacturas() {
        Facturas f = new Facturas();
        f.setVisible(true);
    }
    public static void abrirCaja() {
        Caja c = new Caja();
        c.setVisible(true);
    }
    public static void abrirProveedores() {
        Proveedores p = new Proveedores();
        p.setVisible(true);
    }
    public static void abrirEmpleados() {
        Empleados e = new Empleados();
        e.setVisible(true);
    }
    public static void abrirInventario() {
        Inventario e = new Inventario();
        e.setVisible(true);
    }
    public static void abrirReportes() {
        Reportes r = new Reportes();
        r.setVisible(true);
    }
    public static void abrirRecordatorios() {
        Recordatorios r = new Recordatorios();
        r.setVisible(true);
    }
    public static void abrirConfiguracion() {
        Configuracion c = new Configuracion();
        c.setVisible(true);
    }
    public static void abrirVentas() {
        Ventas v = new Ventas();
        v.setVisible(true);
    }
    public static void abrirCambioSesion() {
        Login l = new Login();
        l.setVisible(true);
    }
    public static void abrirHome() {
        Dashboard dashboard = new Dashboard();
        dashboard.setVisible(true);
    }
}
