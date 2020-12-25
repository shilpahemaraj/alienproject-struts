package com.techworld.action;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.techworld.dto.AlienDTO;
import com.techworld.form.AlienForm;

public class AlienAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		AlienForm formBean = (AlienForm) form;
		AlienDTO alienDTO = new AlienDTO();

		if ((formBean.getAlienDTO().getAlienId() != null) && (formBean.getAlienDTO().getAlienName() != null)
				&& (formBean.getAlienDTO().getAlienPlanet() != null) && (formBean.getAlienDTO().getAge() != null)) {
			alienDTO = formBean.getAlienDTO();
		}
		List<AlienDTO> alienDTOList = new ArrayList<AlienDTO>(Arrays.asList(formBean.getAlienDTO_List()));
		if (formBean.getCount() != null) {
			if (alienDTOList.size() != formBean.getCount()) {
				alienDTOList.add(alienDTO);
				AlienDTO[] alienDTOArray = new AlienDTO[alienDTOList.size()];
				alienDTOArray = alienDTOList.toArray(alienDTOArray);
				formBean.setAlienDTO_List(alienDTOArray);

			}
		}
		if(formBean.getAlienDTO_List().length != 0)
		System.out.println(Arrays.toString(formBean.getAlienDTO_List()));
		
		formBean.setAlienDTO(new AlienDTO());

		return mapping.findForward("success");
	}

}
