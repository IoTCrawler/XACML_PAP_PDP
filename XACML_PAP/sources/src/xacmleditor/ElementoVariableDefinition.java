/*
 * Copyright 2005, 2006 Alberto Jim�nez L�zaro
 *                      Pablo Galera Morcillo (umu-xacml-editor-admin@dif.um.es)
 *                      Dpto. de Ingenier�a de la Informaci�n y las Comunicaciones
 *                      (http://www.diic.um.es:8080/diic/index.jsp)
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package xacmleditor;

import java.util.Map;

/* **************************************************************
 * Name: ElementoVariableDefinition
 *
 * Description: */
/** This class represents the XACML VariableDefinition Element.
 *
 * @author Alberto Jim�nez L�zaro y Pablo Galera Morcillo
 * @version 1.3
 ****************************************************************/
public class ElementoVariableDefinition
    extends ElementoXACML {

  public static final String TIPO_VARIABLEDEFINITION="VariableDefinition";

  public ElementoVariableDefinition(Map ht) {
    super.setTipo(TIPO_VARIABLEDEFINITION	);
    super.setAtributos(ht);
  }

  public String getID() {
    return (String)super.getAtributos().get("VariableId");
  }


  public String[] getAllowedChild(){
     String[] allowedChild=null;
     return allowedChild;
  }

  public String[] getAllObligatory() {
  String[] AllObligatory = {"Apply"};
  return AllObligatory;
}


}
