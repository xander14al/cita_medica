/**
 * Configura un manejador genérico para botones que realizan solicitudes AJAX.
 * @param {string} buttonSelector - Selector de los botones.
 * @param {string} endpoint - Endpoint base para la solicitud, debe incluir `{id}` como marcador de posición.
 * @param {Function} handleResponse - Función para manejar la respuesta del backend.
 */
function setupAjaxEdit(buttonSelector, endpoint, handleResponse) {
    const buttons = document.querySelectorAll(buttonSelector);

    buttons.forEach(button => {
        button.addEventListener("click", async function () {
            const id = this.getAttribute("data-id");
            console.log(`Cargando datos del backend para ID: ${id}`);

            try {
                const url = endpoint.replace("{id}", id);
                const response = await fetch(url);

                if (!response.ok) {
                    throw new Error(`Error al consultar los datos del backend: ${response.status}`);
                }

                const data = await response.json();
                console.log("Datos recibidos:", data);

                // Llama a la función personalizada para manejar la respuesta
                handleResponse(data);
            } catch (error) {
                console.error("Error al obtener los datos:", error);
                alert("No se pudo cargar los datos. Intenta nuevamente.");
            }
        });
    });
}
