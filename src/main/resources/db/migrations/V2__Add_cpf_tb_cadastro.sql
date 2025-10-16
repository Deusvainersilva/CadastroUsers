-- V2 - Adiciona a coluna CPF na tabela tb_cadastro
ALTER TABLE tb_cadastro
ADD COLUMN CPF VARCHAR(11) UNIQUE;