package org.o7planning.restfulcrud.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.o7planning.restfulcrud.dao.CTTruyenDao;
import org.o7planning.restfulcrud.dao.DSTruyenDao;
import org.o7planning.restfulcrud.model.CTTruyen;
import org.o7planning.restfulcrud.model.DSTruyen;

@Path("/cttruyens")
public class CTTruyenService {
	@GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<CTTruyen> getEmployees_JSON() {
        List<CTTruyen> listOfCountries = CTTruyenDao.getAllCTTruyen();
        return listOfCountries;
    }
	
	@Path("/{dstruyen.MATRUYEN}")
	@GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<CTTruyen> getEmployees_JSON2(@PathParam("dstruyen.MATRUYEN") int ma) {
		
        List<CTTruyen> listOfCountries = CTTruyenDao.getCTTruyenId(ma);
        return listOfCountries;
    }
}
