CREATE TABLE IF NOT EXISTS T_OAUTH2_CLIENT (
  client_id               VARCHAR(256) PRIMARY KEY,
  client_secret           VARCHAR(256),
  client_name             VARCHAR(1024),
  client_type             VARCHAR(64),
  home_uri                VARCHAR(256),
  webhook_uri             VARCHAR(256),
  access_token_validity   INTEGER,
  refresh_token_validity  INTEGER,
  avatar                  VARCHAR(256),
  status                  VARCHAR(64),
  rsa_private_key         VARCHAR(2048),
  rsa_public_key          VARCHAR(2048),
  app_customer_id         VARCHAR(64),
  owner_operator_id       VARCHAR(64),
  expire_datetime         TIMESTAMP WITHOUT TIME ZONE,
  update_datetime         TIMESTAMP WITHOUT TIME ZONE,
  create_datetime         TIMESTAMP WITHOUT TIME ZONE
);

CREATE sequence SEQ_CLIENT_ID increment by 1 minvalue 1 no maxvalue start with 1;

comment on table  T_OAUTH2_CLIENT                         is 'APP表,只支持client credentials todo';
comment on column T_OAUTH2_CLIENT.client_id               is 'appId, appKey';
comment on column T_OAUTH2_CLIENT.client_secret           is 'appSecret';
comment on column T_OAUTH2_CLIENT.client_name             is 'app 名字';
comment on column T_OAUTH2_CLIENT.client_type             is 'app类型, feign-app, inner-app';
comment on column T_OAUTH2_CLIENT.home_uri                is '用户主页地址';
comment on column T_OAUTH2_CLIENT.webhook_uri             is 'app webhook地址';
comment on column T_OAUTH2_CLIENT.access_token_validity   is 'token 失效时间 秒(默认2小时)';
comment on column T_OAUTH2_CLIENT.refresh_token_validity  is 'refresh token 失效时间 秒(默认7天)';
comment on column T_OAUTH2_CLIENT.avatar                  is 'app头像';
comment on column T_OAUTH2_CLIENT.status                  is '状态';
comment on column T_OAUTH2_CLIENT.rsa_private_key         is '一些特殊信息(卡号)的加密私钥';
comment on column T_OAUTH2_CLIENT.rsa_public_key          is '一些特殊信息(卡号)的加密公钥';
comment on column T_OAUTH2_CLIENT.owner_operator_id       is '内部服务操作员ID';
comment on column T_OAUTH2_CLIENT.app_customer_id         is 'app对应的会员ID';
comment on column T_OAUTH2_CLIENT.update_datetime         is '更新时间';
comment on column T_OAUTH2_CLIENT.expire_datetime         is '过期时间';
comment on column T_OAUTH2_CLIENT.create_datetime         is '创建时间';

CREATE TABLE IF NOT EXISTS T_CLIENT_SCOPE
(
	scope_id          VARCHAR(64) NOT NULL PRIMARY KEY,
	scope_name        VARCHAR(256) NOT NULL,
	scope_type        VARCHAR(256) NOT NULL,
	scope_icon        VARCHAR(256),
	scope_url         VARCHAR(256),
	parent_id         VARCHAR(64),
	scope_desc        VARCHAR(1024),
	status            VARCHAR(64),
	update_user_id    VARCHAR(64),
	create_user_id    VARCHAR(64),
	update_datetime   TIMESTAMP WITHOUT TIME ZONE,
	create_datetime   TIMESTAMP WITHOUT TIME ZONE
);
CREATE sequence SEQ_SCOPE_ID increment by 1 minvalue 1 no maxvalue start with 1;

comment on table  T_CLIENT_SCOPE                      is 'client权限';
comment on column T_CLIENT_SCOPE.scope_id             is '主键';
comment on column T_CLIENT_SCOPE.parent_id            is '权限父ID';
comment on column T_CLIENT_SCOPE.scope_name           is '权限名';
comment on column T_CLIENT_SCOPE.scope_type           is '权限类型';
comment on column T_CLIENT_SCOPE.scope_icon           is '权限图标';
comment on column T_CLIENT_SCOPE.scope_url            is '权限路径';
comment on column T_CLIENT_SCOPE.scope_desc           is '权限描述';
comment on column T_CLIENT_SCOPE.status               is 'o.c.b.model.Status';
comment on column T_CLIENT_SCOPE.update_user_id       is '更新操作员';
comment on column T_CLIENT_SCOPE.create_user_id       is '创建操作员';
comment on column T_CLIENT_SCOPE.update_datetime      is '更新时间';
comment on column T_CLIENT_SCOPE.create_datetime      is '创建时间';

CREATE TABLE IF NOT EXISTS T_CLIENT_CONNECT_SCOPE
(
	connect_id        VARCHAR(64) NOT NULL PRIMARY KEY,
	scope_id          VARCHAR(64) NOT NULL,
  client_id         VARCHAR(256) NOT NULL,
	status            VARCHAR(64),
	update_user_id    VARCHAR(64),
	create_user_id    VARCHAR(64),
	update_datetime   TIMESTAMP WITHOUT TIME ZONE,
	create_datetime   TIMESTAMP WITHOUT TIME ZONE
);
CREATE sequence SEQ_SCOPE_CONNECT_ID increment by 1 minvalue 1 no maxvalue start with 1;

comment on table  T_CLIENT_CONNECT_SCOPE                      is 'app 范围';
comment on column T_CLIENT_CONNECT_SCOPE.connect_id           is '主键';
comment on column T_CLIENT_CONNECT_SCOPE.client_id            is '客户端ID';
comment on column T_CLIENT_CONNECT_SCOPE.scope_id             is '范围ID';
comment on column T_CLIENT_CONNECT_SCOPE.status               is 'o.c.b.model.Status';
comment on column T_CLIENT_CONNECT_SCOPE.update_user_id       is '更新操作员';
comment on column T_CLIENT_CONNECT_SCOPE.create_user_id       is '创建操作员';
comment on column T_CLIENT_CONNECT_SCOPE.update_datetime      is '更新时间';
comment on column T_CLIENT_CONNECT_SCOPE.create_datetime      is '创建时间';

CREATE TABLE IF NOT EXISTS T_CLIENT_TOKEN(
  token_id                VARCHAR(64) NOT NULL PRIMARY KEY,
  client_id               VARCHAR(256) NOT NULL,
	access_token            VARCHAR(2048) NOT NULL,
  refresh_token           VARCHAR(2048),
  access_token_validity   INTEGER,
  refresh_token_validity  INTEGER,
	status                  VARCHAR(64),
	scope                   VARCHAR(2048),
	create_datetime         TIMESTAMP WITHOUT TIME ZONE
);

CREATE sequence SEQ_CLIENT_TOKEN_ID increment by 1 minvalue 1 no maxvalue start with 1;


comment on table  T_CLIENT_TOKEN                        is 'token表';
comment on column T_CLIENT_TOKEN.token_id               is '生成的ID';
comment on column T_CLIENT_TOKEN.client_id              is '客户端ID';
comment on column T_CLIENT_TOKEN.access_token           is 'token';
comment on column T_CLIENT_TOKEN.refresh_token          is 'refresh_token 暂时不可用';
comment on column T_CLIENT_TOKEN.access_token_validity  is 'access过期时长';
comment on column T_CLIENT_TOKEN.refresh_token_validity is 'refresh过期时长';
comment on column T_CLIENT_TOKEN.status                 is '请求认证的status';
comment on column T_CLIENT_TOKEN.scope                  is '范围[暂时不可用]';
comment on column T_CLIENT_TOKEN.create_datetime        is '创建token时间';

CREATE TABLE IF NOT EXISTS T_CLIENT_TOKEN_HIS(
  token_id                VARCHAR(64) NOT NULL,
  client_id               VARCHAR(256) NOT NULL,
	access_token            VARCHAR(2048) NOT NULL,
  refresh_token           VARCHAR(2048),
  access_token_validity   INTEGER,
  refresh_token_validity  INTEGER,
	status                  VARCHAR(64),
	scope                   VARCHAR(2048),
	create_datetime         TIMESTAMP WITHOUT TIME ZONE,
	expire_datetime         TIMESTAMP WITHOUT TIME ZONE
) partition by range (create_datetime);

comment on table  T_CLIENT_TOKEN_HIS                        is 'token 历史表(按照create_time分表)';
comment on column T_CLIENT_TOKEN_HIS.token_id               is '生成的ID';
comment on column T_CLIENT_TOKEN_HIS.client_id              is '客户端ID';
comment on column T_CLIENT_TOKEN_HIS.access_token           is 'token';
comment on column T_CLIENT_TOKEN_HIS.refresh_token          is 'refresh_token 暂时不可用';
comment on column T_CLIENT_TOKEN_HIS.access_token_validity  is 'access过期时长';
comment on column T_CLIENT_TOKEN_HIS.refresh_token_validity is 'refresh过期时长';
comment on column T_CLIENT_TOKEN_HIS.status                 is '请求认证的status';
comment on column T_CLIENT_TOKEN_HIS.scope                  is '范围[暂时不可用]';
comment on column T_CLIENT_TOKEN_HIS.create_datetime        is '创建token时间';
comment on column T_CLIENT_TOKEN_HIS.expire_datetime        is '过期时间';

CREATE TABLE  T_CLIENT_TOKEN_HIS_201811 partition OF T_CLIENT_TOKEN_HIS(token_id PRIMARY KEY,client_id,access_token,refresh_token,access_token_validity,refresh_token_validity,status,scope,create_datetime,expire_datetime) for values
FROM ('2018-11-01') to ('2018-12-01');
CREATE INDEX IDX_T_CLIENT_TOKEN_HIS_201811_CLIENT_ID ON T_CLIENT_TOKEN_HIS_201811 USING btree(client_id);
CREATE INDEX IDX_T_CLIENT_TOKEN_HIS_201811_CREATE_DATETIME ON T_CLIENT_TOKEN_HIS_201811 USING btree(create_datetime);

CREATE TABLE  T_CLIENT_TOKEN_HIS_201812 partition OF T_CLIENT_TOKEN_HIS(token_id PRIMARY KEY,client_id,access_token,refresh_token,access_token_validity,refresh_token_validity,status,scope,create_datetime,expire_datetime) for values
FROM ('2018-12-01') to ('2019-01-01');
CREATE INDEX IDX_T_CLIENT_TOKEN_HIS_201812_CLIENT_ID ON T_CLIENT_TOKEN_HIS_201812 USING btree(client_id);
CREATE INDEX IDX_T_CLIENT_TOKEN_HIS_201812_CREATE_DATETIME ON T_CLIENT_TOKEN_HIS_201812 USING btree(create_datetime);