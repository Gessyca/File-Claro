/*
 * Gessyca.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
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
		arquivosClaro = new ArrayList<Arquivo>();
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
