package fr.treeptik.initjava;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLDomSample { // permet de parcourir un fichier XML en recherchant des balises particulières

	public static void main(String[] args) throws XPathExpressionException, ParserConfigurationException, SAXException, IOException {
		
		File file = new File("personnages.xml");
		
		DocumentBuilder dbuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		
		Document doc = dbuilder.parse(file);
		
		Element element = doc.getDocumentElement();
		
		XPath newXPath = XPathFactory.newInstance().newXPath();
		
		
		// pour afficher un seul type de balise (ici on veut afficher le type du personnage)
		
		String evaluate = newXPath.evaluate("/listPersonnage/personnage/type", element);
		System.out.println(evaluate);
		
		
		
		// pour afficher toutes les balises
		
		XPathExpression xPathExpression = newXPath.compile("//personnage");
		NodeList list =(NodeList) xPathExpression.evaluate(element, XPathConstants.NODESET);
		for (int i = 0; i < list.getLength(); i++) {
			Node node = list.item(i);
			System.out.println(node.getTextContent());
		}
	

	}

}
