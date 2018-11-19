package co.edu.ucatolica.clustering.front.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("/check")
public class ClusteringCheckResponse {
	
	@RequestMapping(method = RequestMethod.GET, value = "/clustering-exec/{Id}")
	public ResponseEntity<String> sendClusteringData(@PathVariable("Id") String Id) {

		return null;

	}

}
