package com.vega.APIProvider.mapper;

import java.util.Set;

import com.easylink.api.model.Provider;
import com.vega.APIProvider.dto.ProviderDto;

public interface ProviderMapper {
	ProviderDto ProviderToProviderDto(Provider Provider);
	Provider ProviderDtoToProvider(ProviderDto Providerdto);
	Set<ProviderDto> ProviderSetToProviderDtoSet(Set<Provider> Providers);
	Set<Provider> ProviderDtoSetToProviderSet(Set<ProviderDto> Providersdtos);
}
