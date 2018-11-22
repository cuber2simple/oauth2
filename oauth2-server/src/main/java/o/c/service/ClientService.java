package o.c.service;

import o.c.dal.entity.ClientEntity;

public interface ClientService {

    boolean create(ClientEntity record);

    ClientEntity loadByClientId(String clientId);

    boolean update(ClientEntity record);


}
