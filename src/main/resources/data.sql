INSERT INTO usuario (id, nome, login, senha, email) VALUES (1, 'João Vitor', 'joaovitor', '123', 'joao@email.com');

ALTER SEQUENCE usuario_id_seq RESTART WITH 2;

INSERT INTO perfil (id, descricao) VALUES (1, 'Administrador');

ALTER SEQUENCE perfil_id_seq RESTART WITH 2;