
-- Criação das tabelas:

CREATE TABLE IF NOT EXISTS Endereco (
	id_endereco bigserial PRIMARY KEY,
	logradouro varchar(255),
	estado varchar(50),
	cidade varchar (60),
	numero varchar(10),
	cep varchar(11)
);

CREATE TABLE IF NOT EXISTS Funcionarie (
	id_funcionario bigserial PRIMARY KEY,
	nome varchar(128) NOT NULL,
	matricula varchar(128) NOT NULL,
	tempo_experiencia integer,
	id_endereco bigint REFERENCES endereco(id_endereco)
);

CREATE TABLE IF NOT EXISTS Nutricionista (
	id_nutricionista bigserial PRIMARY KEY,
	crn varchar(15) NOT NULL,
	especialidade varchar(128)
);

CREATE TABLE IF NOT EXISTS Paciente (
	id_paciente bigserial PRIMARY KEY,
	nome varchar(128) NOT NULL,
	data_nascimento date,
	cpf varchar(11) NOT NULL,
	telefone varchar(20),
	email varchar(128),
	id_endereco bigint REFERENCES endereco(id_endereco)
);

CREATE TABLE IF NOT EXISTS Consulta (
	id_consulta bigserial PRIMARY KEY,
	id_nutricionista bigint NOT NULL REFERENCES Nutricionista(id_nutricionista),
	id_paciente bigint NOT NULL REFERENCES Paciente(id_paciente),
	data_consulta date,
	observacoes text
	);

--Insira, pelo menos, três registros para cada tabela:

INSERT INTO Endereco (logradouro, estado, cidade, numero, cep)
VALUES ('Rua dos Sanduíches de Pepino', 'Hampshire', 'Portsmouth', 'S/N', '91910-000'),
	('Rua das Pinturas', 'Pernambuco', 'Olinda', '1200', '81729-020'),
	('Rua dos Paletós', 'Ceará', 'Fortaleza', '89', '71930-005'),
	('Rua dos Candelabros', 'Rio Grande do Sul', 'Itaara', '137', '64021-090'),
	('Rua das Rosas', 'São Paulo', 'São Paulo', '492', '50029-000'),
	('Rua das Baleias', 'Acre', 'Acrelândia', '210', '40290-100');

INSERT INTO Funcionarie (nome, matricula, tempo_experiencia, id_endereco)
VALUES ('Elizabeth Bennet','29304', 10, 1),
	('Charles Bingley','22309', 10, 2),
	('Lydia Bennet','26394', 10, 3);

INSERT INTO Nutricionista (crn, especialidade)
VALUES ('CRN-7/1234/P','Nutrição esportiva'),
	('CRN-7/6789','Nutriçnao Materno infantil'),
	('CRN-7/5749','Comportamento alimentar');

INSERT INTO Paciente (nome, data_nascimento, cpf, telefone, email, id_endereco)
	VALUES ('George Wickham', '01/30/1974', '12345678901', '(11) 98765-4321', 'george@pandp.com', 4),
	('Catherine de Bourgh', '02/25/1951', '54321098765', '+1 (678) 901-2345', 'lady@aristocrats.com', 5),
	('Fitzwilliam Darcy', '03/15/1982', '34567890123', '(81) 91133-2930', 'misterdarcy@gmail.com', 6);

INSERT INTO Consulta (id_nutricionista, id_paciente, data_consulta, observacoes)
	VALUES (1,1, '06/16/2024', 'Paciente apresenta uma má alimentação e estilo de vida preocupantes.'),
	(2,2, '06/06/2024', 'Lady Catherine de Bourgh aprecia refeições elegantes e luxuosas, enfatizando a alta gastronomia. Sua dieta inclui iguarias como caviar, trufas e vinhos raros.'),
	(3,3, '06/29/2024', 'O senhor Darcy requer uma dieta equilibrada para manter sua saúde e resistência.');

-- Atualize o telefone de um dos pacientes:

UPDATE Paciente SET telefone='(11) 97654-3210' WHERE nome = 'George Wickham';

-- Delete um registro da tabela:

DELETE FROM Consulta WHERE id_nutricionista = 3;
DELETE FROM Nutricionista WHERE id_nutricionista = 3;
