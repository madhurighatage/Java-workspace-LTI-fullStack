package com.lti.homeloan.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.lti.homeloan.bean.LoanTransaction;
import com.lti.homeloan.bean.LoanType;
import com.lti.homeloan.bean.UserDetails;
import com.lti.homeloan.bean.UserLogin;
import com.lti.homeloan.bean.UserRegistration;

@Repository
public class UserRegDaoImpl implements UserRegDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public int saveRegisterUser(UserDetails userdtl) {
		UserRegistration ur = new UserRegistration();
		ur.setFirstname(userdtl.getFirstname());
		ur.setLastname(userdtl.getLastname());
		ur.setGender(userdtl.getGender());
		ur.setMobileNo(userdtl.getMobileNo());
		ur.setPrimaryEmail(userdtl.getPrimaryEmail());
		ur.setState(userdtl.getState());
		if (!ur.equals(null)) {
			em.persist(ur);
		}
		UserLogin ul = new UserLogin();
		ul.setUr(ur);
		ul.setUserPassword(userdtl.getPassword());
		ul.setUserRole(userdtl.getUserRole());
		em.persist(ul);
		LoanTransaction lt = new LoanTransaction();
		lt.setLoanAmount(userdtl.getLoanAmt());
		lt.setTenure(userdtl.getLoanTenure());
		lt.setAppStatus(userdtl.getAppStatus());

		LoanType l = em.find(LoanType.class, userdtl.getLoanTypeId());
		System.out.println(l);
		lt.setLoanType(l);
		lt.setUr(ur);
		em.persist(lt);
		return ur.getUserResId();
	}
	
	@Override
	public int adminLogin(int userId, String userPassword) {
		UserLogin userLogin=em.find(UserLogin.class, userId);
		if(userLogin.getUserRole()=="Admin" && userLogin.getUserRole()!=null) {
			return 0;
		}
		else {
			return 1;			
		}
	}

}
