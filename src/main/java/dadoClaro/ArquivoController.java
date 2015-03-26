package dadoClaro;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Inject;

import org.primefaces.event.FileUploadEvent;

@SessionScoped
@ManagedBean
public class ArquivoController {

	private List<Arquivo> arquivosClaro;
	@Inject
	private ArquivoBusiness business;

	@PostConstruct
	public void inicializar() {
		arquivosClaro = new ArrayList();
	}

	public void carregarArquivo(FileUploadEvent event) throws IOException {
		if (event != null) {
			arquivosClaro = business.coletarDados(event.getFile());
		}

	}

	public List<Arquivo> getArquivosClaro() {
		return arquivosClaro;
	}

	public void setArquivosClaro(List<Arquivo> arquivosClaro) {
		this.arquivosClaro = arquivosClaro;
	}
}
