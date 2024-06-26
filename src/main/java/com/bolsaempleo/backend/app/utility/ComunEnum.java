package com.bolsaempleo.backend.app.utility;

import java.math.RoundingMode;
import java.util.Locale;
import java.util.TimeZone;

public enum ComunEnum {
PATRON_FECHA1("yyyy/MM/dd"),
    PATRON_FECHA2("yyyyMMdd"),
    PATRON_FECHA3("yyyyMM"),
    PATRON_FECHA4("yyyy-MM"),
    PATRON_TIMESTAMP("dd/MM/yyyy HH:mm:ss"),
    PATRON_TIMESTAMP2("yyyy-MM-dd HH:mm:ss"),
    PATRON_FECHA5("yyyy-MM-dd"),
    PATRON_TIMESTAMP_PERIODO("d/M/yy H:mm:ss.SSS"),
    PATRON_FECHA6("yyyy-MM-dd"),
    PATRON_FECHA7("dd-MM-yyyy"),
    PATRON_FECHA8("dd-MM-yyyy hh:mm:ss"),
    PATRON_VALIDA_CORREO("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"),
    /**
	 * RESPUESTA ESTADO WEB SERVICE 
	 
	CORRECTO("200"),//La solicitud se ha completado satisfactoriamente.
    RECURSOCREADO("201"),//La solicitud se ha completado satisfactoriamente; se ha creado un recurso nuevo.
    RECURSOVACIO("204"),//La solicitud se ha completado satisfactoriamente pero el contenido no está disponible
    INCORRECTO("400"),//La solicitud REST contiene parámetros que no son válidos o que están ausentes.
    NOAUTORIZADO("401"),//El interlocutor no está autorizado a realizar la solicitud.
    PROHIVIDO("403"),//El interlocutor no está autorizado a completar la solicitud.
    RECURSONOENCONTRADO("404"),//El recurso solicitado no existe.
    RECURSONOACEPTABLE("406"),//Se ha solicitado un tipo de contenido o de codificación de contenido no soportado.
    CONFLICTO("409"),//Existe un conflicto con el estado actual del recurso. La acción solicitada no se puede llevar a cabo en el recurso en su estado actual.
    TIPOSOPORTENOSOPORTADO("415"),//La solicitud contiene un tipo de contenido o una codificación de contenido desconocidos.
    ERRORINTERNOSERVIDOR("500"),//Se ha producido un problema; se proporciona más información en el rastreo de la pila.
    NOIMPLEMENTADO("501"),//La solicitud no tiene soporte en la API de REST de IBM® Business Process Manager
    TIMEOUT("100"),//El servidor no responde.
	MENSAJECORRECTO("OK"),
	*/
    /**
	 * ESTADO ENTIDADES
	 */
	ACTIVO("1"),
	INACTIVO("0"),
    MENSAJECORRECTO("OK"),
    MENSAJEINCORRECTO("FAILED"),
    MENSAJESINDATOS("VACIO"),
    MENSAJEERRORINTERNOSERVIDOR("SE HA PRODUCIDO UN PROBLEMA"),
    MENSAJERECURSOCREADO("RECURSO CREADO EXITOSAMENTE"),
    MENSAJERECURSOELINADO("RECURSO ELIMINADO EXITOSAMENTE"),
    MENSAJERECURSONOEXISTE("RECURSO NO EXISTE"),
	/**
	 * VALOR PARA EL CAMPO TODOS
	 */
	TODOS("%"),
	;
	
   
    
    private String descripcion;
    public static final TimeZone TIMEZONE_ECUADOR;
    public static final Locale LOCALE_ECUADOR;
    public static final int NUMERO_DECIMALES = 2;
    public static final RoundingMode MODO_REDONDEO;


    private ComunEnum(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    static {
        TIMEZONE_ECUADOR = TimeZone.getTimeZone("America/Guayaquil");
        LOCALE_ECUADOR = new Locale("es_EC");
        MODO_REDONDEO = RoundingMode.HALF_UP;
    }
    
    /**
     * ESTADO CIVIL
     */
    public enum EstadoCivil {
    	SOLTERO(11, "SOLTERO"), CASADO(12, "CASADO"), DIVORCIADO(13, "DIVORCIADO"), VIUDO(14, "VIUDO"), UNIDO(15, "UNIDO"), EN_UNION_DE_HECHO(16, "EN UNION DE HECHO");
    	
    	private Integer id;
    	private String nombre;

		private EstadoCivil(Integer id, String nombre) {
			this.id = id;
			this.nombre = nombre;
		}
		
		public Integer getId() {
			return id;
		}

		public String getNombre() {
			return nombre;
		}

    }
    /**
	 * RESPUESTA ESTADO WEB SERVICE 
     * 
     **/
    public static final Integer CORRECTO = 200;//La solicitud se ha completado satisfactoriamente.
    public static final Integer RECURSOCREADO = 201;//La solicitud se ha completado satisfactoriamente; se ha creado un recurso nuevo.
    public static final Integer RECURSOVACIO = 204;//La solicitud se ha completado satisfactoriamente pero el contenido no está disponible
    public static final Integer INCORRECTO = 400;//La solicitud REST contiene parámetros que no son válidos o que están ausentes.
    public static final Integer NOAUTORIZADO = 401;//El interlocutor no está autorizado a realizar la solicitud.
    public static final Integer PROHIVIDO = 403;//El interlocutor no está autorizado a completar la solicitud.
    public static final Integer RECURSONOENCONTRADO = 404;//El recurso solicitado no existe.
    public static final Integer RECURSONOACEPTABLE = 406;//Se ha solicitado un tipo de contenido o de codificación de contenido no soportado.
    public static final Integer CONFLICTO = 409;//Existe un conflicto con el estado actual del recurso. La acción solicitada no se puede llevar a cabo en el recurso en su estado actual.
    public static final Integer TIPOSOPORTENOSOPORTADO = 415;//La solicitud contiene un tipo de contenido o una codificación de contenido desconocidos.
    public static final Integer ERRORINTERNOSERVIDOR = 500;//Se ha producido un problema; se proporciona más información en el rastreo de la pila.
    public static final Integer NOIMPLEMENTADO = 501;//La solicitud no tiene soporte en la API de REST de IBM® Business Process Manager
    public static final Integer TIMEOUT = 100;//El servidor no responde.
    /**
	 * JWT metodo login - Autenticacion - Filtro de autenticacion y validacion del token 
     * 
     **/
    public final static String SECRET_KEY = "algun_token_con_alguna_frase_secreta";
    public final static String PREFIX_TOKEN = "Bearer ";
    public final static String HEADER_AUTHORIZATION = "Authorization";
    /**
	 * Tipologia de los reportes 
     * 
     **/
    public final static String EXCEL = "EXCEL";
    public final static String PDF = "PDF ";

}
