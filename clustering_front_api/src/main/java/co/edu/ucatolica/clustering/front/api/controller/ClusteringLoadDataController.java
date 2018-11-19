package co.edu.ucatolica.clustering.front.api.controller;

import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import co.edu.ucatolica.clustering.front.api.model.ApiClusteringMethodRequest;

@RestController("/data")
public class ClusteringLoadDataController {

	@RequestMapping(method = RequestMethod.POST, value = "/upload")
	public ResponseEntity<String> sendClusteringData(@RequestBody ApiClusteringMethodRequest methodData,
			@RequestParam("csvFile") MultipartFile csvFile) {

		return null;

	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/download/{Id}")
	public ResponseEntity<Resource> downLoadClusteringExec(@PathVariable("Id") String Id) {

		return null;

	}

}
