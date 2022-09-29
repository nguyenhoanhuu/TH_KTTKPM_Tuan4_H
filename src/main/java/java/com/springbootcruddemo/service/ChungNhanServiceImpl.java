package java.com.springbootcruddemo.service;

import java.com.springbootcruddemo.repository.ChungNhanRespository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChungNhanServiceImpl implements ChungNhanService {
	
	@Autowired
	ChungNhanRespository chungNhanRespository;

	@Override
	public List<String> findByBoeing() {
		// TODO Auto-generated method stub
		return chungNhanRespository.findByBoeing();
	}

}
