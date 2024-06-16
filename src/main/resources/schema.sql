CREATE TABLE IF NOT EXISTS case_history
(
	case_id bigint NOT NULL,
    first_name character varying(255),
	middle_name character varying(255),
    last_name character varying(255),
    creation_date date,
    registration_no character varying(255),
    address character varying(255),
    birth_date date,
    sex character varying(255),
    occupation character varying(255),
    religion character varying(255),
    marital_status character varying(255),
    phone character varying(255),
    complaint text,
    updated_date character varying(255),
    CONSTRAINT case_history_pkey PRIMARY KEY (case_id)
);