INSERT INTO usuario (usuario, senha)
SELECT 'admin', '123'
WHERE NOT EXISTS (SELECT 1 FROM usuario WHERE usuario = 'admin');