package java.com.springbootcruddemo.service;

import java.com.springbootcruddemo.entity.NhanVien;
import java.util.List;

public interface NhanVienService {
	public List<NhanVien> findByLuongNhoHon10000();
	public int sumLuong();
	public List<NhanVien> findBymaMB747();
	public List<String> findMaByNVLaiBoeingVaAirbus();
	public List<String> findTenByNVLaiBoeing();
	public List<String> findMaNVChiLaiDuoc3LoaiMayBay();
	public List<Object[]> findMaNVLaiDuocHon3LoaiMayBayVaMaxTamBay();
	public List<Object[]> findMaNVAndCountLoaiMayBayCoTheLai();
	public List<NhanVien> findNVKhongPhaiPhiCong();
	public List<String> findNVMaxLuong();
	public int tongSoLuongPhaiTra();
}
