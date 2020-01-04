package controller;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import entity.BillDetail;
import service.BillService;

@Controller
@RequestMapping("/admin/")
@Transactional
public class AdminBillController {

	@Autowired
	SessionFactory factory;

	@Autowired
	BillService billService;
	
	@Autowired
	HttpSession session;

	@RequestMapping(value = "bill", method = RequestMethod.GET)
	public String viewBillList(ModelMap model) {
		if (session.getAttribute("adminsession") != null) {
		model.addAttribute("listBill", billService.getAllBill(0, 10));
		model.addAttribute("page", billService.countTotalRecordsBill() / 10);
		model.addAttribute("totalItem", billService.countTotalRecordsBill());
		model.addAttribute("countItem", 10);
		return "admin/bill_list";
		}
		return "404";
	}

	@RequestMapping(value = "bill/{page}", method = RequestMethod.GET)
	public String viewBillListByPage(ModelMap model, @PathVariable("page") int page) {
		model.addAttribute("listBill", billService.getAllBill((page - 1) * 10, 10));
		model.addAttribute("page", billService.countTotalRecordsBill() / 10);
		model.addAttribute("totalItem", billService.countTotalRecordsBill());
		if ((page * 10) > billService.countTotalRecordsBill()) {
			model.addAttribute("countItem", billService.countTotalRecordsBill() - (page - 1) * 10);
		} else {
			model.addAttribute("countItem", 10);
		}
		return "admin/bill_list";
	}

	@RequestMapping(value = "bill/detail/{id}", method = RequestMethod.GET)
	public String editBill(ModelMap model, @PathVariable("id") int idBill) {
		List<BillDetail> list = billService.getBillDetail(idBill);
		model.addAttribute("listBillDetail", list);
		model.addAttribute("bill", billService.getOneBill(idBill));
		return "admin/billdetail_form";
	}

	@RequestMapping(value = "bill/detail/{id}", method = RequestMethod.POST)
	public String editBill(ModelMap model, @ModelAttribute("billDetail") BillDetail billDetail) {
//		boolean check = billService.updateProduct(billDetail);
//		if(check) {
//			model.addAttribute("message","Cập nhật thành công!");
//		}else {
//			model.addAttribute("message","Cập nhật thất bại!");
//		}
		return "admin/billdetail_form";
	}

	@RequestMapping("bill/updateStatus/{id}")
	public String updateBillStatus(ModelMap model, @PathVariable("id") int id) {
		boolean check = billService.updateBillStatus(id);
		if (check) {
			model.addAttribute("message", "Đã thanh toán thành công!");
		} else {
			model.addAttribute("message", "Đã thanh toán thất bại!");
		}
		return "redirect:/admin/bill.html";
	}

	@RequestMapping("bill/remove/{id}")
	public String deleteBillStatus(ModelMap model, @PathVariable("id") int id) {
		boolean check = billService.removeBill(id);
		if (check) {
			model.addAttribute("message", "Hủy đơn hàng thành công!");
		} else {
			model.addAttribute("message", "Hủy đơn hàng thất bại!");
		}
		return "redirect:/admin/bill.html";
	}

}
