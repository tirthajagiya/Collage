import { inject } from '@angular/core';
import { CanActivateFn, Router } from '@angular/router';

export const aunthenticationGuard: CanActivateFn = (route, state) => {
  const _router = inject(Router)
  if (localStorage.getItem('username') && localStorage.getItem('password')) {
    
  } else {

  }
};
