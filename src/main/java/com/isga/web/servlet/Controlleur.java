package com.isga.web.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.isga.web.modele.Book;
import com.isga.web.modele.Model;


/**
 * Servlet implementation class Controlleur
 */
@WebServlet(urlPatterns = {"*.apsx" , "/index.do"})
public class Controlleur extends HttpServlet {
	
	private Model model;
	
	public void init() throws ServletException{
		super.init();
		model = new Model();
	}
       
    public Controlleur() {
    	
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
		String action = (String)request.getParameter("action");
		if(action != null) {
			switch(action) {
			case("home"):
				request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
				break;
			case("addbook"):
				request.setAttribute("model", model);
				request.getRequestDispatcher("/WEB-INF/book.jsp").forward(request, response);
				break;
			}		
		}else {
        
        request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
		}
	}
	
	@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			String titre = (String)req.getParameter("titre");
			String auteur = (String)req.getParameter("auteur");
			String genre = (String)req.getParameter("genre");
			String statut = (String)req.getParameter("disponible");
			String image = (String)req.getParameter("image");
			String annee = (String)req.getParameter("annee");
			
			int year = 2000;
			try {
				year = Integer.parseInt(annee);
			}catch(Exception e) {
				
			}
			Boolean stat = true;
			if(statut.equals("non")) stat=false;
			
			Book livre = new Book(titre,  auteur,  genre,  year,  stat,  image);
			
			model.getLivres().add(livre);
			req.setAttribute("model", model);
			
			req.getRequestDispatcher("/WEB-INF/book.jsp").forward(req, resp);
			
		}

	
	
}
