from django.urls import path

from . import views

urlpatterns = [
    path('', views.index, name='index'),
    path('add', views.add_devices, name='add_devices'),
    path('details', views.get_details, name='get_details'),
  
    
]
