package com.vega.APIProvider.mapper;

import java.util.Set;

import com.easylink.api.model.Convention;
import com.vega.APIProvider.dto.ConventionDto;

public interface ConventionMapper {
	ConventionDto ConventionToConventionDto(Convention Convention);
	Convention ConventionDtoToConvention(ConventionDto Conventiondto);
	Set<ConventionDto> ConventionSetToConventionDtoSet(Set<Convention> Conventions);
	Set<Convention> ConventionDtoSetToConventionSet(Set<ConventionDto> Conventionsdtos);
}
