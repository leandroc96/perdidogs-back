package com.perdidogs.PerdidogsBackend.helper;

public class JsonExamples {
	
	public static final String CONSULTA_LISTA_ADOPCIONES = "{\"respuesta\":{\"codigo\":\"string\",\"descripcion\":\"string\"}}";

	public static final String CONSULTA_LISTA_ADOPCIONES_400 = "{\"cuentas\":[{\"emisor_cbu\":\"2990008600808036340008\",\"banco_codigo\":\"299\",\"emisor_cuenta\":\"00080803634\",\"emisor_subcuenta\":\"\",\"emisor_moneda\":\"032\",\"emisor_cuenta_fecha_alta\":\"2019-12-10T17:48:15\",\"sucursal_codigo\":\"0008\",\"sucursal_nombre\":\"Centro\",\"sucursal_domicilio\":\"Sin domicilio\",\"sucursal_cp\":\"1035\",\"sucursal_provincia\":\"Sin provincia\",\"emisor_cuit\":\"30681490465\",\"emisor_razon_social\":\"MACOFIII S.R.L.\",\"emisor_domicilio\":\"PJE JUAN MIGUEL ESPARZA 87\",\"emisor_cp\":\"1171\",\"cuenta_estado\":\"INACTIVA\",\"fecha_alta\":\"2019-06-07T14:38:36\",\"fecha_ult_modificacion\":\"2021-05-20T13:00:03\",\"emails\":[]},{\"emisor_cbu\":\"2990008600808035970004\",\"banco_codigo\":\"299\",\"emisor_cuenta\":\"00080803597\",\"emisor_subcuenta\":\"\",\"emisor_moneda\":\"032\",\"emisor_cuenta_fecha_alta\":\"2021-05-12T16:35:50\",\"sucursal_codigo\":\"0008\",\"sucursal_nombre\":\"CENTRO\",\"sucursal_domicilio\":\"Av. Pte. Roque Saenz Peña 660\",\"sucursal_cp\":\"1035\",\"sucursal_provincia\":\"CAPITAL FEDERAL\",\"emisor_cuit\":\"30681490465\",\"emisor_razon_social\":\"MACOFIII S.R.L.\",\"emisor_domicilio\":\"PJE JUAN MIGUEL ESPARZA 87\",\"emisor_cp\":\"1171\",\"cuenta_estado\":\"ACTIVA\",\"fecha_alta\":\"2019-06-13T10:10:46.03\",\"fecha_ult_modificacion\":\"2021-05-12T13:35:52\",\"emails\":[]},{\"emisor_cbu\":\"2990000000000086460002\",\"banco_codigo\":\"299\",\"emisor_cuenta\":\"00000008646\",\"emisor_subcuenta\":\"\",\"emisor_moneda\":\"032\",\"emisor_cuenta_fecha_alta\":\"2020-03-12T20:54:10.84\",\"sucursal_codigo\":\"0000\",\"sucursal_nombre\":\"Casa Central\",\"sucursal_domicilio\":\"AV. PRESIDENTE ROQUE SAENZ PEÑA 660\",\"sucursal_cp\":\"1035\",\"sucursal_provincia\":\"CAPITAL FEDERAL\",\"emisor_cuit\":\"30681490465\",\"emisor_razon_social\":\"MACOFIII S.R.L.\",\"emisor_domicilio\":\"PJE JUAN MIGUEL ESPARZA 87\",\"emisor_cp\":\"1171\",\"cuenta_estado\":\"ACTIVA\",\"fecha_alta\":\"2019-06-13T10:11:49.37\",\"fecha_ult_modificacion\":\"2020-03-12T17:54:44.183\",\"emails\":[]},{\"emisor_cbu\":\"2990008600808036270004\",\"banco_codigo\":\"299\",\"emisor_cuenta\":\"00080803627\",\"emisor_subcuenta\":\"\",\"emisor_moneda\":\"032\",\"emisor_cuenta_fecha_alta\":\"2019-12-20T18:13:07.657\",\"sucursal_codigo\":\"0008\",\"sucursal_nombre\":\"Centro\",\"sucursal_domicilio\":\"Sin domicilio\",\"sucursal_cp\":\"1035\",\"sucursal_provincia\":\"Sin provincia\",\"emisor_cuit\":\"30681490465\",\"emisor_razon_social\":\"MACOFIII S.R.L.\",\"emisor_domicilio\":\"PJE JUAN MIGUEL ESPARZA 87\",\"emisor_cp\":\"1171\",\"cuenta_estado\":\"ACTIVA\",\"fecha_alta\":\"2019-09-10T15:25:42.357\",\"fecha_ult_modificacion\":\"2019-12-20T15:13:17.29\",\"emails\":[]}],\"total_cuentas\":4,\"respuesta\":{\"codigo\":\"2400\",\"descripcion\":\"CONSULTA EXITOSA\"}}";

	public static final String CONSULTA_LISTA_ADOPCIONES_409 = "{\"sucursal_codigo\":\"0008\",\"sucursal_nombre\":\"Centro\",\"sucursal_domicilio\":\"Sin domicilio\",\"sucursal_cp\":\"1035\",\"sucursal_provincia\":\"Sin provincia\",\"emisor_cuit\":\"30681490465\",\"emisor_razon_social\":\"MACOFIII S.R.L.\",\"emisor_cbu\":\"2990008600808036340008\",\"emisor_cuenta\":\"00080803634\",\"emisor_subcuenta\":\"\",\"emisor_cuenta_fecha_alta\":\"2021-05-20T12:10:00\",\"emisor_moneda\":\"032\",\"emisor_domicilio\":\"PJE JUAN MIGUEL ESPARZA 87\",\"emisor_cp\":\"1171\"}";

	public static final String ALTA_ADOPCION_409 = "{\"respuesta\": { \"codigo\": \"1000\", \"descripcion\": \"CUENTA EMISORA CREADA\" }}";

	public static final String MODIFICACION_ADOPCION_409 = "{\"respuesta\": { \"codigo\": \"1200\", \"descripcion\": \"CUENTA EMISORA ELIMINADA /INACTIVA\"}}";

	public static final String BAJA_ADOPCION_409 = "{\"descripcion\": \"Hubo un error al intentar procesar el request\"}";
	
}