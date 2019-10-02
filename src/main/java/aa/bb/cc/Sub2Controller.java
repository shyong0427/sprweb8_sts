package aa.bb.cc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Sub2Controller {
	@RequestMapping(value = "/sub2", method = RequestMethod.GET)
	public ModelAndView none(HttpServletRequest request) {
		String param = request.getParameter("irum");
		String msg = "Sub2 요청 처리 : " + param;
		
		return new ModelAndView("list2", "msg", msg);
	}
}