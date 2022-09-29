package java.com.springbootcruddemo.repository;


import java.com.springbootcruddemo.entity.ChungNhan;
import java.com.springbootcruddemo.entity.ChungNhanPK;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ChungNhanRespository extends JpaRepository<ChungNhan, ChungNhanPK>  {
//	9. Cho biết mã số của các phi công lái máy báy Boeing
	@Query(value = "SELECT        nhanvien.MaNV\r\n"
			+ "FROM            chungnhan INNER JOIN\r\n"
			+ "                         maybay ON chungnhan.MaMB = maybay.MaMB INNER JOIN\r\n"
			+ "                         nhanvien ON chungnhan.MaNV = nhanvien.MaNV\r\n"
			+ "where  Loai like '%Boeing%'\r\n"
			+ "group by nhanvien.MaNV", nativeQuery = true)
	public List<String> findByBoeing();
	

	
}
