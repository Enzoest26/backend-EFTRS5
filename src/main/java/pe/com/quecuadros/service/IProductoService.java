package pe.com.quecuadros.service;

import java.util.List;

import org.springframework.data.domain.Page;

import pe.com.quecuadros.model.BaseResponse;
import pe.com.quecuadros.model.CuadroRequest;
import pe.com.quecuadros.model.Producto;
import pe.com.quecuadros.model.ProductoRequest;

public interface IProductoService {
	
	public List<Producto> buscarTodos();
	
	public List<Producto> obtener3Ultimos();
	
	public Producto buscarPorId(Integer id);
	
	public Page<Producto> buscarPorPaginado(Integer pagina);
	
	public Producto registrarProducto(ProductoRequest producto);
	
	public BaseResponse actualizarProducto(ProductoRequest producto);
	
	public BaseResponse eliminarProducto(Integer id);
	
	public Producto resgistrarCuadroPersonalizado(CuadroRequest cuadroRequest);
	
	public Producto actualizarCuadroPersonalizado(Integer id, CuadroRequest cuadroRequest);
}
