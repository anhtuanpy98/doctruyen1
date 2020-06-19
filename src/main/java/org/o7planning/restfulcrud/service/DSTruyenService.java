package org.o7planning.restfulcrud.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.o7planning.restfulcrud.dao.DSTruyenDao;
import org.o7planning.restfulcrud.model.DSTruyen;

@Path("/employees")
public class DSTruyenService{
	@GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<DSTruyen> getEmployees_JSON() {
        List<DSTruyen> listOfCountries = DSTruyenDao.getAllEmployees();
        return listOfCountries;
    }
}
