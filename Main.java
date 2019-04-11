public void botonEliminar() {
		///Conectamos
		conn = getConnection();
		try {
		///Preparamos
			ps = conn.prepareStatement("select * from usuarios where codigo=? ");
			ps.setString(1, cajaClave.getText());
		///Ejecutamos
			rs = ps.executeQuery();
			
			if (rs.next()) {
				///Devolvemos los resultados a las cajas
				
			} else {
				///No hay nadie 
				cajaClave.setText(rs.getString("clave"));
				cajaNombre.setText(rs.getString("nombre"));
			}
			
		} catch (Exception e) {
			// TODO se derrumbo
		}	
	}
