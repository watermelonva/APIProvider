package com.vega.APIProvider.mapper;

import java.util.Set;

import com.easylink.api.model.Sector;
import com.vega.APIProvider.dto.SectorDto;

public interface SectorMapper {
	SectorDto SectorToSectorDto(Sector Sector);
	Sector SectorDtoToSector(SectorDto Sectordto);
	Set<SectorDto> SectorSetToSectorDtoSet(Set<Sector> Sectors);
	Set<Sector> SectorDtoSetToSectorSet(Set<SectorDto> Sectorsdtos);
}
