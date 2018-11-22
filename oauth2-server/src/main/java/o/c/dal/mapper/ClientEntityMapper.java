package o.c.dal.mapper;

import o.c.dal.entity.ClientEntity;
import o.c.gj.mapper.BaseMapper;

public interface ClientEntityMapper extends BaseMapper<ClientEntity, String> {
    String nextClientId();
}