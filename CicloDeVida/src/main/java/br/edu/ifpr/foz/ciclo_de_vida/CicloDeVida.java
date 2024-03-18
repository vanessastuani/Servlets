package br.edu.ifpr.foz.ciclo_de_vida;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;

@WebServlet(name = "cicloDeVida", value = "/cicloDeVida")
public class CicloDeVida extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Invocou o método init");
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Invocou o método service");
    }

    @Override
    public void destroy() {
        System.out.println("Invocou o método destroy");
    }
}
