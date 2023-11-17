function showAddress(){
     const addressContainer = document.querySelector("#address");
     addressContainer.style.display = "flex";
     hideOrderContainer();
     hidePaymentContainer();

     buttonSelected(2);
}

function showPayment(){
     const addressContainer = document.querySelector("#payment");
     addressContainer.style.display = "flex";
     hideOrderContainer();
     hideAddressContainer();

     buttonSelected(3)
}

function showOrder(){
     const addressContainer = document.querySelector("#order");
     addressContainer.style.display = "flex";
     hidePaymentContainer();
     hideAddressContainer();

     buttonSelected(1)
}

function hideAddressContainer(){
     const orderContainer = document.querySelector("#address");
     orderContainer.style.display = "none";
}

function hideOrderContainer(){
     const orderContainer = document.querySelector("#order");
     orderContainer.style.display = "none";
}

function hidePaymentContainer(){
     const orderContainer = document.querySelector("#payment");
     orderContainer.style.display = "none";
}

function buttonSelected(index){
    const btnOrder = document.querySelector("#btn-order");
    const btnAddress = document.querySelector("#btn-address");
    const btnPayment = document.querySelector("#btn-payment");

    switch(index){
        case 1:
            btnOrder.classList.remove('elemento');
            btnOrder.classList.add('elemento-sel');
            btnAddress.classList.remove('elemento-sel');
            btnPayment.classList.remove('elemento-sel');
        break;
        case 2:
            btnAddress.classList.remove('elemento');
            btnAddress.classList.add('elemento-sel');
            btnPayment.classList.remove('elemento-sel');
            btnOrder.classList.remove('elemento-sel');
        break;
        case 3:
            btnPayment.classList.remove('elemento');
            btnPayment.classList.add('elemento-sel');
            btnOrder.classList.remove('elemento-sel');
            btnAddress.classList.remove('elemento-sel');
        break;
        default:
            btnOrder.classList.remove('elemento');
            btnOrder.classList.add('elemento-sel');
    }
}

function changeProduct() {
    var selectBox = document.getElementById("floatingSelectBox");
    var selectedValue = selectBox.options[selectBox.selectedIndex].value;
    getItem(selectedValue);
 }

 function changeClient() {
     var selectBox = document.getElementById("floatingSelectBoxClient");
     var selectedValue = selectBox.options[selectBox.selectedIndex].value;
     getClient(selectedValue);
  }

function getItem(productID){
    let xhr = new XMLHttpRequest();
    let url = "/product-get?productID=" + productID;
    xhr.open('GET', url, true);
    xhr.onreadystatechange = function() {
    	if (xhr.readyState == 4) {
    		if (xhr.status === 200){
    		    let product = JSON.parse(xhr.response);
    		    setProduct(product);
    			console.log(xhr.responseText);
    		}
    	}
    }
    	xhr.send();
    }

function getClient(clientID){
    let xhr = new XMLHttpRequest();
    let url = "/client-get?clientID=" + clientID;
    xhr.open('GET', url, true);
    xhr.onreadystatechange = function() {
    	if (xhr.readyState == 4) {
    		if (xhr.status === 200){
    		    let product = JSON.parse(xhr.response);
    		    setClient(product);
    		}
    	}
    }
    	xhr.send();
    }

function setClient(client){
    document.getElementById("floatingZipcode").value = client.zipcode.toString();
    document.getElementById("floatingAddress").value = client.address.toString();
    document.getElementById("floatingAddressNumber").value = client.addressNumber.toString();
}

function setProduct(product){
    document.getElementById("floatingValue").value = product.value.toString();
    convertTypeName(product.productType);
}
function convertTypeName(productType){
    switch(productType){
        case 'SMALL':
            document.getElementById("floatingType").value = 'PEQUENA';
            break;
        case 'MEDIUM':
            document.getElementById("floatingType").value = 'MEDIA';
            break;
        case 'BIG':
            document.getElementById("floatingType").value = 'GRANDE';
            break;
        default:
            document.getElementById("floatingType").value = 'SEM TAMANHO';

    }
}
