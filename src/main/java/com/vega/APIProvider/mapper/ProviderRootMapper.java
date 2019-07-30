package com.vega.APIProvider.mapper;

import java.util.Set;

import com.easylink.api.model.ProviderRoot;
import com.vega.APIProvider.dto.ProviderRootDto;

public interface ProviderRootMapper {
	ProviderRootDto ProviderRootToProviderRootDto(ProviderRoot ProviderRoot);
	ProviderRoot ProviderRootDtoToProviderRoot(ProviderRootDto ProviderRootdto);
	Set<ProviderRootDto> ProviderRootSetToProviderRootDtoSet(Set<ProviderRoot> ProviderRoots);
	Set<ProviderRoot> ProviderRootDtoSetToProviderRootSet(Set<ProviderRootDto> ProviderRootsdtos);
}
