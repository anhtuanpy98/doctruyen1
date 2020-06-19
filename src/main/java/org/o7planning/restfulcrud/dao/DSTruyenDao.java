package org.o7planning.restfulcrud.dao;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.o7planning.restfulcrud.model.DSTruyen;




public class DSTruyenDao {
	
	
	public static List<DSTruyen> getAllEmployees() {
		 SessionFactory factory = org.o7planning.restful.HibernateUtils.getSessionFactory();
		 
	      Session session = factory.getCurrentSession();
	 
	      try {
	          // Tất cả các lệnh hành động với DB thông qua Hibernate
	          // đều phải nằm trong 1 giao dịch (Transaction)
	          // Bắt đầu giao dịch
	          session.getTransaction().begin();
	 
	          // Tạo một câu lệnh HQL query object.
	          // Tương đương với Native SQL:
	          // Select e.* from EMPLOYEE e order by e.EMP_NAME, e.EMP_NO
	 
	          String sql = "Select e from " + DSTruyen.class.getName() + " e "
	                  + " order by e.MATRUYEN, e.TENTRUYEN ";
	 
	          // Tạo đối tượng Query.
	          Query<DSTruyen> query = session.createQuery(sql);
	 
	          // Thực hiện truy vấn.
	          list = query.getResultList();
	 
	          
	 
	          // Commit dữ liệu
	          session.getTransaction().commit();
	      } catch (Exception e) {
	          e.printStackTrace();
	          // Rollback trong trường hợp có lỗi xẩy ra.
	          session.getTransaction().rollback();
	      }
	      
	      return list;
    }
     
    public static List<DSTruyen> list;

	

}
