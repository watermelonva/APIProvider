package com.vega.APIProvider.mapper;

import java.util.Set;

import com.easylink.api.model.Amicale;
import com.vega.APIProvider.dto.AmicaleDto;

public interface AmicaleMapper {
	AmicaleDto AmicaleToAmicaleDto(Amicale amicale);
	Amicale AmicaleDtoToAmical(AmicaleDto amicaledto);
	Set<AmicaleDto> AmicaleSetToAmicaleDtoSet(Set<Amicale> amicales);
	Set<Amicale> AmicaleDtoSetToAmicaleSet(Set<AmicaleDto> amicalesdtos);
}
