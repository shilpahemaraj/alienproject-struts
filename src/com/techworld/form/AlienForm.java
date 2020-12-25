package com.techworld.form;

import org.apache.struts.action.ActionForm;

import com.techworld.dto.AlienDTO;

public class AlienForm extends ActionForm {
	private static final long serialVersionUID = 7352021000623040587L;
	private Integer count;
	AlienDTO[] alienDTO_List = {};
	AlienDTO alienDTO = new AlienDTO();

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public AlienDTO[] getAlienDTO_List() {
		return alienDTO_List;
	}

	public void setAlienDTO_List(AlienDTO[] alienDTO_List) {
		this.alienDTO_List = alienDTO_List;
	}

	public AlienDTO getAlienDTO() {
		return alienDTO;
	}

	public void setAlienDTO(AlienDTO alienDTO) {
		this.alienDTO = alienDTO;
	}

}
